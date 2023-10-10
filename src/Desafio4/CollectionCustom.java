package Desafio4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CollectionCustom<T> {
    private T[] array;
    public CollectionCustom() {
    	int size = 0;
		this.array = (T[]) Array.newInstance(Object.class, size);
    }
    
    
    public void addLast(T elemento) {
    	T[] nArray = (T[]) Array.newInstance(Object.class, this.size() + 1);
		for (int i = 0; i < this.size(); i++) {
			nArray[i] = array[i];
		}
		nArray[this.size()] = elemento;
		this.array = nArray.clone();
	}

    public void add(T elemento) {
    	this.addLast(elemento);
    }
    public T remove(T elemento) {
    	T[] nArray = (T[]) Array.newInstance(Object.class, this.size() - 1);
		int index = 0;
		T eliminar = null;

		for (int i = 0; i < this.size(); i++) {
			if (array[i] != elemento) {
				nArray[index] = array[i];
				index++;
			} else {
				eliminar = array[i];
			}
		}
		this.array = nArray.clone();
		return eliminar;
	}
		public void removeAll() {
    	int size = 0;
		this.array = (T[]) Array.newInstance(Object.class, size);
		}
		 @Override
		  	public String toString() {
		  		return Arrays.toString(array);
		  	}
		 public int size() {
		        return array.length;
		    }
		 public void addFirst(T elemento) {
		    	T[] nArray = (T[]) Array.newInstance(Object.class, this.size() + 1);
		    	nArray[0] = elemento;
				for (int i = 0; i < this.size(); i++) {
					nArray[i + 1] = array[i];
				}
				this.array = nArray.clone();
			}
	   public boolean empty() {
	       return array.length == 0;
	   }
  
   
   }
   
