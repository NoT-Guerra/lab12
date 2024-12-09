package it.unibo.es1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		return values.stream().map(x -> x < values.size()).toList();
	}

	@Override
	public int hit(int elem) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hit'");
	}

	@Override
	public String result() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'result'");
	}

	@Override
	public boolean toQuit() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'toQuit'");
	}
}
