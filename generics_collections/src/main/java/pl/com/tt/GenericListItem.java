package pl.com.tt;

public class GenericListItem<T> {
	
	private T value;
	private GenericListItem<T> nextElement;
	
	public GenericListItem(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public GenericListItem<T> getNextElement() {
		return nextElement;
	}

	public void setNextElement(GenericListItem<T> nextElement) {
		this.nextElement = nextElement;
	}

}
