package quiz08;

public class MainClass {

	public static void main(String[] args) {

		Producer producer = new Producer();
		
		Singer singer1 = new Singer("alice", 3);
		Singer singer2 = new Singer("emily", 5);
		
		producer.produce(singer1, new Song("a", "1"));		
		producer.produce(singer1, new Song("b", "2"));
		producer.produce(singer1, new Song("c", "3"));
		producer.produce(singer1, new Song("d", "4"));

		
		producer.produce(singer2, new Song("e", "5"));
		producer.produce(singer2, new Song("f", "6"));
		producer.produce(singer2, new Song("g", "7"));
		producer.produce(singer2, new Song("h", "8"));
		producer.produce(singer2, new Song("i", "9"));

		singer1.info();
		singer2.info();
	}

}
