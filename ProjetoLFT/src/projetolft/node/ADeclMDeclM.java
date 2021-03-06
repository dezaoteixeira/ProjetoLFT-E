/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class ADeclMDeclM extends PDeclM
{
    private PVariavel _variavel_;
    private PDeclM _declM_;

    public ADeclMDeclM()
    {
        // Constructor
    }

    public ADeclMDeclM(
        @SuppressWarnings("hiding") PVariavel _variavel_,
        @SuppressWarnings("hiding") PDeclM _declM_)
    {
        // Constructor
        setVariavel(_variavel_);

        setDeclM(_declM_);

    }

    @Override
    public Object clone()
    {
        return new ADeclMDeclM(
            cloneNode(this._variavel_),
            cloneNode(this._declM_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclMDeclM(this);
    }

    public PVariavel getVariavel()
    {
        return this._variavel_;
    }

    public void setVariavel(PVariavel node)
    {
        if(this._variavel_ != null)
        {
            this._variavel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variavel_ = node;
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
            + toString(this._variavel_)
            + toString(this._declM_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._variavel_ == child)
        {
            this._variavel_ = null;
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
        if(this._variavel_ == oldChild)
        {
            setVariavel((PVariavel) newChild);
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
