package aula4excessoespersonalizadas.solucao3boa.model.exception;

// Exception obrigado a tratar
// Runtimeexception sem tratar
public class DomainException extends Exception{
    public DomainException(String message){
        super(message);
    }
}
