package DesignPatterns.StructuralPatterns;
interface MediaPlayer{
  void play(String type,String name);
}
interface AdvancedMediaPlayer{
  void playMp4(String name);
  void playWav(String name);
}
class Mp4Player implements AdvancedMediaPlayer{
   public void playMp4(String name){
     System.out.println("Playing mp4 file:"+name);
   }
   public void playWav(String name){
    // System.out.println("Playing wav file:"+name);
   }
}

class WavPlayer implements AdvancedMediaPlayer{

  public void playMp4(String name){
    
  }
  public void playWav(String name){

  System.out.println("Playing wav file:"+name);
  }
}
class MediaAdaptor implements MediaPlayer{
  private AdvancedMediaPlayer ad;

 MediaAdaptor(String type,String name){
     if(type.equals("Mp4")){
      ad=new Mp4Player();
     }else if(type.equalsIgnoreCase("Wav")){
      ad=new WavPlayer();
     }
 }

 public void play(String type,String name){
  if(type.equals("Mp4")){
    ad.playMp4(name);
  }
  if(type.equalsIgnoreCase("Wav")){
    ad.playWav(name);
  }
 }


}


class AudioPlayer implements MediaPlayer{
  MediaAdaptor ma;
  public void play(String type,String name){
   if(type.equalsIgnoreCase("Mp3"))
    System.out.println("Playing Mp3 file:"+name);
   else if(type.equalsIgnoreCase("Mp4")||type.equalsIgnoreCase("Wav")){
    ma=new MediaAdaptor(type,name);
    ma.play(type,name);}
    else
    System.out.println("Invalid");
  
   
   }

   }


public class AdaptorPattern {
  public static void main(String[] args) {
    MediaPlayer m=new AudioPlayer();
    m.play("Mp3","Kuchbhi");
  }
}
