package com.crg.mail;

import java.util.Iterator;
import java.util.Random;

/**
 *  邮件对象
 * @author aloe
 *
 */
public class Mail {
	enum GeneralDelivery {YES, NO1, NO2, NO3, NO4, NO5}
	enum Scannability {UNSCANNABLE, YES1, YES2, YES3, YES4}
	enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}
	enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5, OK6}
	enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}
	
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Readability readability;
	Address address;
	ReturnAddress returnAddress;
	
	static long counter = 0;
	long id = counter++;
	
	public String toString(){
		return "Mail " + id;
	}
	
	public String details(){
		return toString() + " |GeneralDelivery: " + generalDelivery
				+ " |Scannability: " + scannability
				+ " |Readability: " + readability
				+ " |Address: " + address
				+ " |ReturnAddress: " + returnAddress;
	}
	
	/**
	 * generate test Mail
	 * @return
	 */
	public static Mail randomMail(){
		Mail mail = new Mail();
		mail.generalDelivery = randomEnum(GeneralDelivery.class);
		mail.scannability = randomEnum(Scannability.class);
		mail.readability = randomEnum(Readability.class);
		mail.address = randomEnum(Address.class);
		mail.returnAddress = randomEnum(ReturnAddress.class);
		return mail;
	}
	
	/**
	 *  随机产生一个 Enum 的实例
	 * @param ls
	 * @return
	 */
	public static <T extends Enum<T>> T randomEnum(Class<T> ls){
		return random(ls.getEnumConstants());
	}
	
	/**
	 *  随机产生一个 values 的数组元素
	 * @param values
	 * @return
	 */
	public static <T> T random(T[] values){
		Random random = new Random();
		return values[random.nextInt(values.length)];
	}
	
	public static Iterable<Mail> generator(final int count){
		return new Iterable<Mail>() {
			int n = count;
			@Override
			public Iterator<Mail> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Mail>() {

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return n-- > 0;
					}

					@Override
					public Mail next() {
						// TODO Auto-generated method stub
						return randomMail();
					}
					@Override
					public void remove() {
						// TODO Auto-generated method stub
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}
