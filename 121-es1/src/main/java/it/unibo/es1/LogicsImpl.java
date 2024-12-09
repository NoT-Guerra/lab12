package it.unibo.es1;

import java.util.List;

import javax.swing.JButton;

public class LogicsImpl implements Logics {

	public LogicsImpl(int size) {
		for (int i=0; i < size; i++) {
			JButton _0 = new JButton (""+i);
		}
	}

	@Override
	public int size() {
		return this.size();
	}

	@Override
	public List<Integer> values() {
		return this.values();
	}

	@Override
	public List<Boolean> enablings() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'enablings'");
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
