
public class Kurs1 {

			private String KursAdi;
			private String EgitmenAdi;
			private int izlenmeOrani;
			public Kurs1() {
				
			}
			public String getKursAdi() {
				return KursAdi;
			}


			public void setKursAdi(String kursAdi) {
				KursAdi = kursAdi;
			}


			public String getEgitmenAdi() {
				return EgitmenAdi;
			}


			public void setEgitmenAdi(String egitmenAdi) {
				EgitmenAdi = egitmenAdi;
			}


			public int getIzlenmeOrani() {
				return izlenmeOrani;
			}


			public void setIzlenmeOrani(int izlenmeOrani) {
				this.izlenmeOrani = izlenmeOrani;
			}
			@Override
			public String toString() {
				return "UserData [KursAdi=" + KursAdi + ",EgitmenAdi=" + EgitmenAdi + ", izlenmeOrani=" + izlenmeOrani +"]";
			}
			
			}

