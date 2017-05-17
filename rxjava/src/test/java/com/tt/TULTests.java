package com.tt;

import com.tt.cache.CacheServer;
import com.tt.dao.Person;
import com.tt.dao.PersonDao;
import com.tt.weather.Weather;
import com.tt.weather.WeatherClient;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Observable;
import rx.observables.BlockingObservable;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by dubelm on 2017-05-15.
 */
public class TULTests {

    private static Logger logger = LoggerFactory.getLogger(TULTests.class);
    private PersonDao personDao = new PersonDao();
    private WeatherClient weatherClient = new WeatherClient();

    @Test
    public void test1() {
        // Jak promise w JS
        CompletableFuture<String> future = CompletableFuture.completedFuture("ABC");

        // Then w JS
        CompletableFuture<Integer> integerCompletableFuture = future.thenApply((String s) -> s.length());
    }

    @Test
    public void test2() {
        Observable<String> obs = Observable.just("A", "BCB", "C");
        /*
        Na razie nic sie nie wykona, to tylko czeka na wywołanie, a nie
        jak w CompletableFuture ze od razu sie wykonuje
         */
        Observable<Integer> ints = obs.map((String s) -> s.length());

        ints.subscribe(
                (Integer i) -> System.out.println(i),
                ex -> logger.error("Exception", ex)
        );
    }

    @Test
    public void test3() {
        Observable<Person> personObservable = personDao.rxFindById(23);
        Observable<String> map = personObservable.map(Person::toString);

        map.subscribe(this::print);
    }

    public void print(Object obj) {
        logger.info("GET {}", obj);
    }

    @Test
    public void test4() {
        // Czekamy na wynik 1250 ms
        Observable<Person> personObservable = personDao
                .rxFindById(23)
                .timeout(1250, TimeUnit.MILLISECONDS);

        personObservable.subscribe(this::print);
    }

    @Test
    public void test5() {
        /*
        Dwa asynchronicznie pobierane zasoby z różnych źródeł
         */

        Observable<Person> person = personDao.rxFindById(23);
        Observable<Weather> oslo = weatherClient.rxFetch("Oslo");

        // Czekamy aż pobierze się osoba i pogoda
        Observable<String> str = person.zipWith(oslo,
                (Person p, Weather w) -> p + " : " + w
        );

        // Teraz ustawiamy blokowanie wartku az do skonczenia poprzedniego zadania
        BlockingObservable<String> blocking = str.toBlocking();

        blocking.subscribe(this::print);
    }

    @Test
    public void test6() {
        CacheServer c1 = new CacheServer();
        CacheServer c2 = new CacheServer();

        Observable<String> s1 = c1.rxFindBy(123);
        Observable<String> s2 = c2.rxFindBy(123);

        // Wystarczy ze pobierzemy jeden obiekt, nie interesuje nas z jakiego serwera

        Observable<String> allResults = s1
                .mergeWith(s2)
                .first();

        allResults
                .toBlocking()
                .subscribe(this::print);
    }

    @Test
    public void test7() {
        Observable
                .interval(1, TimeUnit.SECONDS)
                .toBlocking()
                .subscribe(this::print);

    }

    List<String> childredOf(File file){
        return Arrays
                .asList(file.listFiles())
                .stream()
                .map(File::getName)
                .collect(Collectors.toList());
    }

    @Test
    public void test8() {
        File tmp = new File("./");
        System.out.println(childredOf(tmp));
    }

}
