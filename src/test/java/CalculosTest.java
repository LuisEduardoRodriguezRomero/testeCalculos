import com.example.AppSpringCalculos.Entity.Calculos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.target.LazyInitTargetSource;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;


public class  CalculosTest {


    @Test
    public void testeSomaTodos(){

        Calculos calculos = new Calculos();
        List<Integer> valores = Arrays.asList(1,1,1);

        Assertions.assertEquals(3,calculos.somarTodos(valores ));

    }

    @Test
    public void testeMaxNumero(){

        Calculos calculos = new Calculos();
        List<Integer> valores = Arrays.asList(1,5,6);

        Assertions.assertEquals(6,calculos.maxNumero(valores ));

    }


    @Test
    public void testeMinNumero(){

        Calculos calculos = new Calculos();
        List<Integer> valores = Arrays.asList(1,5,6);

        Assertions.assertEquals(1,calculos.minNumero(valores ));

    }



    @Test
    public void testeMedia(){

        Calculos calculos = new Calculos();

        List<Integer> valores =Arrays.asList(1,5,6);

        Assertions.assertEquals(4,calculos.media(valores));

    }


    @Test
    public void testeDesvioPadrao(){
        Calculos calculos = new Calculos();

        List<Integer> valores = Arrays.asList(1,3,5,8);

        Assertions.assertEquals(2.598076211353316,calculos.desvioPadrao(valores));


    }

    @Test
    public void testeMediana(){

        Calculos calculos = new Calculos();

        List<Integer> valores = Arrays.asList(1,2,6,7);

        Assertions.assertEquals(2.5,calculos.mediana(valores));



    }


}
