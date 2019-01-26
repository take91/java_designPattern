
public class Main {

	public static void main(String[] args) {
		Folder root = new Folder("root"), home = new Folder("home"), sdga = new Folder("sdga"),
				music = new Folder("music"), picture = new Folder("picture"), doc = new Folder("doc"),
				usr = new Folder("usr");
		File track1 = new File("track1"), track2 = new File("track2"), pic1 = new File("pic1"), doc1 = new File("doc1"),
				java = new File("java");
		
		
		// 트리구조
		
		root.addComponent(home);
			home.addComponent(sdga);
				sdga.addComponent(music);
					music.addComponent(track1);
					music.addComponent(track2); 
				sdga.addComponent(picture);
					picture.addComponent(pic1);
				sdga.addComponent(doc);
					doc.addComponent(doc1);
			
		root.addComponent(usr);
			usr.addComponent(java);
			
			show(root);
		
	}
	
	private static void show(Component component) {
		
		// getClass로 폴더인지 파일인지 구분, "|" 뒤에 해당 컴포넌트의 이름 출력
		System.out.println(component.getClass().getName()+"|"+component.getName());
		
		// 입력받은 컴포넌트가 폴더일 경우, 폴더 내부에 있는 것들을 재귀적으로 출력
		if(component instanceof Folder) {
			
			for (Component c : ((Folder)component).getChildren()) {
				show(c);
			}
			
		}
		
	}

}
