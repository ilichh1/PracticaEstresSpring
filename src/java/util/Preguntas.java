/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

package util;

/**
 *
 * @author Ilich Arredondo
 */
public class Preguntas {
    
    private static final String[] preguntas = {
                        "¿Se siente demasiado cansado cuando se levanta?",
                        "¿Ha estado expuesto a productos químicos nocivos?",
                        "¿Su trabajo o vivienda esta envuelta en un ambiente ruidoso?",
                        "¿Se exige o le exigen demasiado en la vida?",
                        "¿Se enoja constantemente?",
                        "¿Su trabajo es de cara al cliente?",
                        "¿Siente usted que la gente no respeta su espacio personal?",
                        "¿Se sienta correctamente en su trabajo o a la hora de comer?",
                        "¿No come hasta que siente hambre?",
                        "¿Consumes estimulantes como el café, el tabaco, el alcohol o las bebidas de cola?",
                        "¿Deja que su hambre se prolongue por mucho tiempo?",
                        "¿Siente que le faltan horas de sueño?",
                        "¿Considera que no lo tratan como se merece?",
                        "¿Se ha mudado recientemente?",
                        "¿Ha tenido algun examen importante ultimamente?",
                        "Si tiene pareja ¿Ha tenido alguna discusión con él / ella?",
                        "¿Esta usted desempleado?",
                        "¿Algun familiar o usted mismo sufre de alguna enfermedad?",
                        "¿Ha perdido a algún ser querido recientemente o sigue en duelo por la pérdida de alguno?",
                        "¿Su trabajo le exige más de lo que usted cree poder dar?",
                        "¿Discute con alguien frecuentemente?",
                        "¿Sientes que necesitas más tiempo para ti?",
                        "¿Se considera a usted mismo competitivo en cualquier aspecto de su vida?",
                        "¿Se queda atascado en el tráfico constantemente?",
                        "¿Cree que debería tener mas momentos de regocijo en su vida?",
                        "¿Cree usted que tiene poco tiempo para realizar todas sus tareas?",
                        "¿Siente que su vida no tiene sentido?",
                        "¿Puede cambiar de estado fácilmente?",
                        "¿Te sientes acosado por tus compañeros de trabajo o estudio?"
                    };
    
    public static String[] getPreguntas() {
        return preguntas;
    }
    
    public static int getPreguntasLength() {
        return preguntas.length;
    }

}