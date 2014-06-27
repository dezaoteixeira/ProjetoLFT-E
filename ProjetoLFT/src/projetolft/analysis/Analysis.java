/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.analysis;

import projetolft.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStartStart(AStartStart node);
    void caseAVazio(AVazio node);
    void caseAProgramaEst(AProgramaEst node);
    void caseADeclMDeclaracao(ADeclMDeclaracao node);
    void caseADeclaracao(ADeclaracao node);
    void caseADeclS(ADeclS node);
    void caseADeclM(ADeclM node);
    void caseADeclSDeclM(ADeclSDeclM node);
    void caseAVarNVariavel(AVarNVariavel node);
    void caseAVarVVariavel(AVarVVariavel node);
    void caseANumIntValor(ANumIntValor node);
    void caseANumRealValor(ANumRealValor node);
    void caseACharValor(ACharValor node);
    void caseANumeroRealTipoVariavel(ANumeroRealTipoVariavel node);
    void caseANumIntTipoVariavel(ANumIntTipoVariavel node);
    void caseACaractereTipoVariavel(ACaractereTipoVariavel node);
    void caseAAtribui(AAtribui node);
    void caseALeiaEst(ALeiaEst node);
    void caseALeiaS(ALeiaS node);
    void caseALeiaM(ALeiaM node);
    void caseALeiaSLeiaM(ALeiaSLeiaM node);
    void caseAEscrevaEst(AEscrevaEst node);
    void caseAEscrevaS(AEscrevaS node);
    void caseAEscrevaM(AEscrevaM node);
    void caseAEscrevaSEscrevaM(AEscrevaSEscrevaM node);
    void caseAExp(AExp node);
    void caseAVExp(AVExp node);
    void caseAMeExp(AMeExp node);
    void caseAExp1(AExp1 node);
    void caseANadaExp1(ANadaExp1 node);
    void caseAMaisSoma(AMaisSoma node);
    void caseAMenosSoma(AMenosSoma node);
    void caseATermo(ATermo node);
    void caseATermo1(ATermo1 node);
    void caseANadaTermo1(ANadaTermo1 node);
    void caseAMultMult(AMultMult node);
    void caseADivMult(ADivMult node);
    void caseAFator(AFator node);
    void caseAValoorFator(AValoorFator node);
    void caseATermoExpA(ATermoExpA node);
    void caseAMaisExpA(AMaisExpA node);
    void caseAVarExpA(AVarExpA node);
    void caseAMaisSomaA(AMaisSomaA node);
    void caseAMenosSomaA(AMenosSomaA node);
    void caseAFatTermoA(AFatTermoA node);
    void caseAMultTermoA(AMultTermoA node);
    void caseAMultMultA(AMultMultA node);
    void caseADivMultA(ADivMultA node);
    void caseAExpressaoFatorA(AExpressaoFatorA node);
    void caseAValorFatorA(AValorFatorA node);
    void caseAMmmFatorA(AMmmFatorA node);
    void caseAExpTermoExp(AExpTermoExp node);
    void caseAExp1TermoExp(AExp1TermoExp node);
    void caseAExp2TermoExp(AExp2TermoExp node);
    void caseAExp3TermoExp(AExp3TermoExp node);
    void caseAExp4TermoExp(AExp4TermoExp node);
    void caseAExp5TermoExp(AExp5TermoExp node);
    void caseAExp6TermoExp(AExp6TermoExp node);
    void caseAFatTermoExpl(AFatTermoExpl node);
    void caseATermTermoExpl(ATermTermoExpl node);
    void caseATerm1TermoExpl(ATerm1TermoExpl node);
    void caseATerm2TermoExpl(ATerm2TermoExpl node);
    void caseATermoExplogica(ATermoExplogica node);
    void caseANaoExplogica(ANaoExplogica node);
    void caseARepitaEst(ARepitaEst node);
    void caseAForParaEst(AForParaEst node);
    void caseAForPassoParaEst(AForPassoParaEst node);
    void caseAFor1(AFor1 node);
    void caseAFor2(AFor2 node);
    void caseAEnquantoEst(AEnquantoEst node);
    void caseASeEst(ASeEst node);
    void caseAElseSeEst(AElseSeEst node);
    void caseASeSen(ASeSen node);
    void caseAAvalieEst(AAvalieEst node);
    void caseAAvalieAvalieEst(AAvalieAvalieEst node);
    void caseACasoCasoM(ACasoCasoM node);
    void caseACasoM(ACasoM node);
    void caseADeclComando(ADeclComando node);
    void caseAAtribuiComando(AAtribuiComando node);
    void caseALerComando(ALerComando node);
    void caseAEscreverComando(AEscreverComando node);
    void caseALaco1Comando(ALaco1Comando node);
    void caseALaco2Comando(ALaco2Comando node);
    void caseALaco3Comando(ALaco3Comando node);
    void caseASeComando(ASeComando node);
    void caseACaseComando(ACaseComando node);
    void caseAVazioComando(AVazioComando node);

    void caseTVirgula(TVirgula node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTPonto(TPonto node);
    void caseTParenEsq(TParenEsq node);
    void caseTParenDir(TParenDir node);
    void caseTColcheteEsq(TColcheteEsq node);
    void caseTColcheteDir(TColcheteDir node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivInt(TDivInt node);
    void caseTMenorQue(TMenorQue node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTFaca(TFaca node);
    void caseTAte(TAte node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTEnquanto(TEnquanto node);
    void caseTConstante(TConstante node);
    void caseTPara(TPara node);
    void caseTRepita(TRepita node);
    void caseTInicio(TInicio node);
    void caseTPrograma(TPrograma node);
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTSe(TSe node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTEntao(TEntao node);
    void caseTAvalie(TAvalie node);
    void caseTSenao(TSenao node);
    void caseTCaso(TCaso node);
    void caseTFimP(TFimP node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTFimSe(TFimSe node);
    void caseTFimPara(TFimPara node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTNao(TNao node);
    void caseTBlanks(TBlanks node);
    void caseTNumeroInt(TNumeroInt node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTString(TString node);
    void caseTIdentificador(TIdentificador node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentadoA(TComentadoA node);
    void caseTCorpo(TCorpo node);
    void caseTEstrela(TEstrela node);
    void caseTBarra(TBarra node);
    void caseTComentadoFinal(TComentadoFinal node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
