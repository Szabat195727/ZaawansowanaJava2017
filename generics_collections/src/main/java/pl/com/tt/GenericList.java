package pl.com.tt;

public class GenericList<T> {

	private GenericListItem<T> firstElement;
	private GenericListItem<T> currentElement;
	private int size;
	
	public GenericList() {
		super();
		this.firstElement = null;
		this.currentElement = null;
		this.size = 0;
	}

	public void add(T newEl) {
		GenericListItem<T> element = new GenericListItem<>(newEl);
		if (size == 0){
			
			firstElement = element;
			currentElement = element;
			
		} else {
			
			GenericListItem<T> node = firstElement;
			while (node.getNextElement() != null){
				node = node.getNextElement();
			}
			node.setNextElement(element);
			
		}
		size++;
	}
	
	public GenericListItem<T> get(int number){
		if (number > size){
			throw new NullPointerException();
		} else {
			GenericListItem<T> foundItem = firstElement;
			for (int i = 1; i <= number; i++){
				foundItem = foundItem.getNextElement();
			}
			return foundItem;
		}
	}

}
