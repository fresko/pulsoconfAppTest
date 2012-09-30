package pulsoconf.music.list.bean;

import java.util.ArrayList;
import java.util.List;
import pulsoconf.music.list.logic.MusicListGeneric;

public class MusicBean {
	
	private List<MusicListGeneric> lstMusic  = new ArrayList<MusicListGeneric>();
	
	/**
	 * 
	 * Consult Music
	 * @return
	 */
	public String action_consult(){
		lstMusic  = new ArrayList<MusicListGeneric>();
		lstMusic = loadMusic();
		
	 return "";	
	}
	
	public String action_consult2(){
		    lstMusic  = new ArrayList<MusicListGeneric>();
			lstMusic = loadMusic2();
			
		 return "";	
		}
	
	public List<MusicListGeneric> loadMusic(){
		
	   lstMusic = new ArrayList<MusicListGeneric>();
	   MusicListGeneric music = new MusicListGeneric("Sport", "Rap", "Inda House", "50cent", "0", "httpa://www.youtube.com/watch?v=5qm8PH4xAss", "2");
	   MusicListGeneric music1 = new MusicListGeneric("Sport", "Rap", "Eye Of The Tiger", "Survivor", "0", "http://www.youtube.com/watch?v=btPJPFnesV4", "2");
	   MusicListGeneric music2 = new MusicListGeneric("Sport", "Rap", "Livin' On A Prayer", "Bon Jovi", "0", "http://www.youtube.com/watch?v=lDK9QqIzhwk", "2");
	   MusicListGeneric music3 = new MusicListGeneric("Sport", "Rap", "Tmp", "xx", "0", "http://pulsoconf.co", "2");
	   MusicListGeneric music4 = new MusicListGeneric("Sport", "Rap", "Tmp", "xx", "0", "http://pulsoconf.co", "2");
	   MusicListGeneric music5 = new MusicListGeneric("Sport", "Rap", "Tmp", "xx", "0", "http://pulsoconf.co", "2");
	   
	   lstMusic.add(music);
	   lstMusic.add(music1);
	   lstMusic.add(music2);
	   lstMusic.add(music3);
	   lstMusic.add(music4);
	   lstMusic.add(music5);
	   
	 return lstMusic;	
	}
	
	
	public List<MusicListGeneric> loadMusic2(){
		
		   lstMusic = new ArrayList<MusicListGeneric>();
		   MusicListGeneric music = new MusicListGeneric("Sport", "Rap", "Inda House", "50cent", "0", "httpa://www.youtube.com/watch?v=5qm8PH4xAss", "2");
		   MusicListGeneric music1 = new MusicListGeneric("Sport", "Rap", "Eye Of The Tiger", "Survivor", "0", "http://www.youtube.com/watch?v=btPJPFnesV4", "2");
		   MusicListGeneric music2 = new MusicListGeneric("Sport", "Rap", "Livin' On A Prayer", "Bon Jovi", "0", "http://www.youtube.com/watch?v=lDK9QqIzhwk", "2");
		   
		   
		   lstMusic.add(music);
		   lstMusic.add(music1);
		   lstMusic.add(music2);
		   
		   
		 return lstMusic;	
		}

	public List<MusicListGeneric> getLstMusic() {
		return lstMusic;
	}

	public void setLstMusic(List<MusicListGeneric> lstMusic) {
		this.lstMusic = lstMusic;
	} 
	
	

}
