package structuralpattern.facadepattern.smarthomecontroller.facade;

import structuralpattern.facadepattern.smarthomecontroller.subsystems.Light;
import structuralpattern.facadepattern.smarthomecontroller.subsystems.Security;
import structuralpattern.facadepattern.smarthomecontroller.subsystems.Thermostat;

public class Home {

    Light light;
    Security security;
    Thermostat thermostat;

    public Home()
    {
        this.light=new Light();
        this.security=new Security();
        this.thermostat=new Thermostat();
    }

    public void leave()
    {
        light.offLight();
        security.inSecurity();
        thermostat.reduce();
    }

    public void arrive()
    {
        light.onLight();
        security.offSecurity();
        thermostat.increase();
    }
}
