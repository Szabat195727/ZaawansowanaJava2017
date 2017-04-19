import ratpack.server.RatpackServer;

/**
 * Created by krystian on 05.04.17.
 */
public class Fibb {
    public static void main() throws Exception {
        RatpackServer.start(ratpackServerSpec ->
                ratpackServerSpec.handlers(
                        chain -> chain.prefix("fibo",
                                fibb -> fibb.all(
                                        ctx -> ctx.render("JEST OK")
                                ))));
    }
}
