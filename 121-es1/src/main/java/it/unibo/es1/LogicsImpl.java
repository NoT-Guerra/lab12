package it.unibo.es1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LogicsImpl implements Logics {
	private final List<Integer> values;
	
	public LogicsImpl(int size) {
		this.values = new ArrayList<>(Collections.nCopies(size,0));
		
	}

	@Override
	public int size() {
		return this.values.size();
	}

	@Override
	public List<Integer> values() {
		return Collections.unmodifiableList(values);
	}

	@Override
	public List<Boolean> enablings() {
		return values.stream()
		.map(x -> x < values.size())
		.toList();
	}

	@Override
	public int hit(int elem) {
		int n ;
		n= values.get(elem);
		n = n+1;
		values.set(elem, n);
		return n; 
	}

	@Override
	public String result() {
		return this.values.stream()
		.map(String::valueOf).
		collect(Collectors.joining("|", "<<", ">>"));
	}

	@Override
	public boolean toQuit() {
		return this.values.stream().allMatch(x -> x==this.values.get(0));
	} 
}
