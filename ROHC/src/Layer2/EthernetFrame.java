package Layer2;

import java.util.EmptyStackException;

import Utils.Utils;

public class EthernetFrame {
	
	private final String PREAMBLE="1010101010101010101010101010101010101010101010101010101010101011";
	private char[] destAddr=new char[6];
	private char[] srcAddr=new char[6];
	private char[]type=new char[2];
	private String data;
	private char[]frameCheckSequence=new char[4];
	
	public EthernetFrame(char[]destAddr,char[]srcAddr, char[]type,
			String data) {
		if(destAddr.length!=6 || srcAddr.length!=6 || type.length!=2) {
			throw new EmptyStackException(); //TO CHANGE!
		}
		Utils.copyByValue(destAddr,this.destAddr);
		Utils.copyByValue(srcAddr,this.srcAddr);
		Utils.copyByValue(type,this.type);
		this.data=data;
	}
	
	
}
