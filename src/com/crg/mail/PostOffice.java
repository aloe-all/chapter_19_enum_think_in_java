package com.crg.mail;

public class PostOffice {
	enum MailHandler {
		GENERAL_DELIVERY{

			@Override
			boolean handle(Mail mail) {
				switch (mail.generalDelivery) {
				case YES:
					System.out.println("using general delivery for " + mail);
					return true;

				default:
					return false;
				}
			}},
		
		MACHINE_SCAN {

			@Override
			boolean handle(Mail mail) {
				switch (mail.scannability) {
				case UNSCANNABLE:
					
					return false;

				default:
					switch (mail.address) {
					case INCORRECT:
						return false;
					default:
						System.out.println("delivering " + mail + " automatically");
						return true;
					}
				}
			}
			},
		VISUAL_INSPECTION {

			@Override
			boolean handle(Mail mail) {
				switch (mail.readability) {
				case ILLEGIBLE:
					return false;

				default:
					switch (mail.address) {
					case INCORRECT:
						return false;
					default:
						System.out.println("delivering " + mail + " normally");
						return true;
					}
				}
			}
				
			},
		
		RETURN_TO_SENDER {

			@Override
			boolean handle(Mail mail) {
				switch (mail.returnAddress) {
				case MISSING:
					return false;
				default:
					System.out.println("returning " + mail + " to sender");
					return true;
				}
			}
				
			};
		
		abstract boolean handle(Mail mail);
	}
	static void handleMail(Mail mail){
		for (MailHandler mailHandler : MailHandler.values()) {
			if (!mailHandler.handle(mail)) {
				System.out.println(mail + " is a dead letter");
				return;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Mail mail : Mail.generator(10)) {
			System.out.println(mail.details());
			handleMail(mail);
			System.out.println("==================================================");
		}
	}

}
