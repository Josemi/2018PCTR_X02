public class HiloBall extends Thread {

	private Ball bola;
	private Board board;
	
	public HiloBall(Ball bola, Board board) {
		this.bola=bola;
		this.board=board;
	}
	
	@Override
	public void run() {
		while(true) {
			this.bola.move();
			board.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				return ;
			}
		}
	}
}
