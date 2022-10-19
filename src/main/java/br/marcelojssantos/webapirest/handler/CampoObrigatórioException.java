package br.marcelojssantos.webapirest.handler;

public class CampoObrigatórioException extends BusinessException{
    public CampoObrigatórioException(String campo){
        super("O campo %s é obrigatório", campo);
    }
}
