physical-gpiopin7-on-RPi-demo
=============================

Controlling GPIO Pin7 on Raspberry Pi using JavaME 8 

* GPIO7 is predesignated as an output GPIO Pin. Thus we use DeviceManager to open GPIO7(of the RaspberryPi) and have
its reference in our application.

* Then we call setValue(boolean) method on the GPIO refernece setting them true and false respectively after certain
duration. 

* Once this application is deployed successfully on the RaspberryPi, we can measure 3.3 V (DC) at GPIO7 (generally pin
no. 26 against pin no. 25 which generally is the ground pin (0 V)). 

Note: you would have to set API permissions for your application. I have set DeviceMngtPermission for GPIO7 to 
open,register,unregister. Its pretty simple to set these permissions using any of the IDE; I have used NetBeans 8.0.2.

Your comments awaited. 
