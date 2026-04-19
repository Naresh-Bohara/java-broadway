package javainterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import abstraction.CentralBank;

public class UserServiceImpl extends CentralBank implements UserService, CommonService {

	@Override
	public void addUSer() {
		System.out.println("Added Success!");
	}
	@Override
	public void editUser() {
		// TODO Auto-generated method stub
		UserService.super.editUser();
	}

	@Override
	public void deleteUSer() {
		System.out.println("Deleted Success!");
	}

	@Override
	public void print() {
		System.out.println("Hello there!");
		
	}

	@Override
	public void getBankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInterestRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(int index, String element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<String> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<String> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
