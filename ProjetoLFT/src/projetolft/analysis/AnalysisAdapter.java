/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.analysis;

import java.util.*;
import projetolft.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramaEst(AProgramaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclmDeclaracao(ADeclmDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclMDeclM(ADeclMDeclM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclM(AVarDeclM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarNVariavel(AVarNVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarVVariavel(AVarVVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclComando(ADeclComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuiComando(AAtribuiComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscreverComando(AEscreverComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComando(AComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumIntValor(ANumIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumRealValor(ANumRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharValor(ACharValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealTipoVariavel(ANumeroRealTipoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumIntTipoVariavel(ANumIntTipoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaractereTipoVariavel(ACaractereTipoVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribui(AAtribui node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaEst(ALeiaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaMLeiaM(ALeiaMLeiaM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarLeiaM(AVarLeiaM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaEst(AEscrevaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscMEscrevaM(AEscMEscrevaM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpEscrevaM(AExpEscrevaM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExp(AMaisExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariavelExp(AVariavelExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpExp(AMenosExpExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoExpA(ATermoExpA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisExpA(AMaisExpA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExpA(AVarExpA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaisSomaA(AMaisSomaA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosSomaA(AMenosSomaA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatTermoA(AFatTermoA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultTermoA(AMultTermoA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultMultA(AMultMultA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivMultA(ADivMultA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressaoFatorA(AExpressaoFatorA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFatorA(AValorFatorA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosFatorA(AMenosFatorA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultipleExplogica(AMultipleExplogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExExplogica(AExExplogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleExplogica(ASingleExplogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultipleExpOu(AMultipleExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExppExpOu(AExppExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleExpOu(ASingleExpOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultipleExpXor(AMultipleExpXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatExpXor(AFatExpXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleAuxXor(ASingleAuxXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatAuxXor(AFatAuxXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExigExplFator(AExigExplFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOutroExplFator(AOutroExplFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExdifExplFator(AExdifExplFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMiExplTermo(AMiExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMeiExplTermo(AMeiExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMqExplTermo(AMqExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMeqExplTermo(AMeqExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleExplTermo(ASingleExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicaExplTermo(AUnicaExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplaIgExplTermo(AMultiplaIgExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultiplaDifExplTermo(AMultiplaDifExplTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaEst(ARepitaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForParaEst(AForParaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForPassoParaEst(AForPassoParaEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFor1(AFor1 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFor2(AFor2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoEst(AEnquantoEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfSeEst(AIfSeEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseSeEst(AElseSeEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeSen(ASeSen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANormalAvalieEst(ANormalAvalieEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseAvalieEst(AElseAvalieEst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoCasoM(ACasoCasoM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasoM(ACasoM node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenEsq(TParenEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenDir(TParenDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColcheteEsq(TColcheteEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColcheteDir(TColcheteDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMultiplicacao(TMultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivInt(TDivInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorQue(TMenorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorQue(TMaiorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimP(TFimP node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlanks(TBlanks node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroInt(TNumeroInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentadoA(TComentadoA node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCorpo(TCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentadoFinal(TComentadoFinal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
