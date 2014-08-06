/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ADeclmDeclaracao extends PDeclaracao
{
    private PTipoVariavel _tipoVariavel_;
    private PDeclM _declM_;

    public ADeclmDeclaracao()
    {
        // Constructor
    }

    public ADeclmDeclaracao(
        @SuppressWarnings("hiding") PTipoVariavel _tipoVariavel_,
        @SuppressWarnings("hiding") PDeclM _declM_)
    {
        // Constructor
        setTipoVariavel(_tipoVariavel_);

        setDeclM(_declM_);

    }

    @Override
    public Object clone()
    {
        return new ADeclmDeclaracao(
            cloneNode(this._tipoVariavel_),
            cloneNode(this._declM_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclmDeclaracao(this);
    }

    public PTipoVariavel getTipoVariavel()
    {
        return this._tipoVariavel_;
    }

    public void setTipoVariavel(PTipoVariavel node)
    {
        if(this._tipoVariavel_ != null)
        {
            this._tipoVariavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoVariavel_ = node;
    }

    public PDeclM getDeclM()
    {
        return this._declM_;
    }

    public void setDeclM(PDeclM node)
    {
        if(this._declM_ != null)
        {
            this._declM_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declM_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoVariavel_)
            + toString(this._declM_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoVariavel_ == child)
        {
            this._tipoVariavel_ = null;
            return;
        }

        if(this._declM_ == child)
        {
            this._declM_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoVariavel_ == oldChild)
        {
            setTipoVariavel((PTipoVariavel) newChild);
            return;
        }

        if(this._declM_ == oldChild)
        {
            setDeclM((PDeclM) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}