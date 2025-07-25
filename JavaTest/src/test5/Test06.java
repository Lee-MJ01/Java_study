package test5;

class Artist{
	public String name;
	public String country;
	public int brith;
	
	public Artist(String name, String country, int brith) {
		super();
		this.name = name;
		this.country = country;
		this.brith = brith;
	}

	@Override
	public String toString() {
		return "Artist [name=" + name + ", country=" + country + ", brith=" + brith + "]";
	}
}

public class Test06 {

	public static void main(String[] args) {
		Artist[] Arts= {
				new Artist("레오나르도 다빈치", "이탈리아", 1452),
				new Artist("미켈란젤로", "이탈리아", 1475),
				new Artist("빈센트 반 고흐", "네덜란드", 1853),
				new Artist("클로드 모네", "프랑스", 1840),
				new Artist("파블로 피카소", "스페인", 1881)
		};
		
		for(Artist a : Arts) {
			System.out.println(a);
		}
	}

}
