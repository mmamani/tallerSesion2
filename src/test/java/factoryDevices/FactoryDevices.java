package factoryDevices;


public class FactoryDevices {

      public static IDevice make(String type){
          IDevice device;

          switch (type.toLowerCase()){
              case "android":
                  device= new Android();
                  break;
              case "ios":
                  device= new IOS();
                  break;
              case "windowsphone":
                  device=new WindowsPhone();
                    break;
              default:
                  device= new Android();
                  break;
          }
          return device;
      }
}
