package main.answers;

import main.ReceiverTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class BigDataAnswer extends Answer implements Serializable {
	private static final Logger logger = LoggerFactory.getLogger(ReceiverTask.class);
	public BigDataAnswer() { super("BigData"); }

	@Override
	public void logAnswer() {
		logger.info(answer);
	}

	@Override
	public void printAnswer() {
		System.err.println(answer);
	}
}
