/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoEst extends PEnquantoEst
{
    private TEnquanto _enquanto_;
    private TParenEsq _parenEsq_;
    private PExplogica _explogica_;
    private TParenDir _parenDir_;
    private TFaca _faca_;
    private PComando _comando_;
    private TFimEnquanto _fimEnquanto_;
    private TPontoVirgula _pontoVirgula_;

    public AEnquantoEst()
    {
        // Constructor
    }

    public AEnquantoEst(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TParenEsq _parenEsq_,
        @SuppressWarnings("hiding") PExplogica _explogica_,
        @SuppressWarnings("hiding") TParenDir _parenDir_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TFimEnquanto _fimEnquanto_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setParenEsq(_parenEsq_);

        setExplogica(_explogica_);

        setParenDir(_parenDir_);

        setFaca(_faca_);

        setComando(_comando_);

        setFimEnquanto(_fimEnquanto_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoEst(
            cloneNode(this._enquanto_),
            cloneNode(this._parenEsq_),
            cloneNode(this._explogica_),
            cloneNode(this._parenDir_),
            cloneNode(this._faca_),
            cloneNode(this._comando_),
            cloneNode(this._fimEnquanto_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoEst(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
    }

    public TParenEsq getParenEsq()
    {
        return this._parenEsq_;
    }

    public void setParenEsq(TParenEsq node)
    {
        if(this._parenEsq_ != null)
        {
            this._parenEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenEsq_ = node;
    }

    public PExplogica getExplogica()
    {
        return this._explogica_;
    }

    public void setExplogica(PExplogica node)
    {
        if(this._explogica_ != null)
        {
            this._explogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explogica_ = node;
    }

    public TParenDir getParenDir()
    {
        return this._parenDir_;
    }

    public void setParenDir(TParenDir node)
    {
        if(this._parenDir_ != null)
        {
            this._parenDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenDir_ = node;
    }

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TFimEnquanto getFimEnquanto()
    {
        return this._fimEnquanto_;
    }

    public void setFimEnquanto(TFimEnquanto node)
    {
        if(this._fimEnquanto_ != null)
        {
            this._fimEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimEnquanto_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquanto_)
            + toString(this._parenEsq_)
            + toString(this._explogica_)
            + toString(this._parenDir_)
            + toString(this._faca_)
            + toString(this._comando_)
            + toString(this._fimEnquanto_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._parenEsq_ == child)
        {
            this._parenEsq_ = null;
            return;
        }

        if(this._explogica_ == child)
        {
            this._explogica_ = null;
            return;
        }

        if(this._parenDir_ == child)
        {
            this._parenDir_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._fimEnquanto_ == child)
        {
            this._fimEnquanto_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._parenEsq_ == oldChild)
        {
            setParenEsq((TParenEsq) newChild);
            return;
        }

        if(this._explogica_ == oldChild)
        {
            setExplogica((PExplogica) newChild);
            return;
        }

        if(this._parenDir_ == oldChild)
        {
            setParenDir((TParenDir) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._fimEnquanto_ == oldChild)
        {
            setFimEnquanto((TFimEnquanto) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
