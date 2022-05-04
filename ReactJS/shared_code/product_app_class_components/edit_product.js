import React from 'react'

class EditProductForm extends React.Component {
    constructor(props) {
        super(props)
        this.updateProduct = this.updateProduct.bind(this);
        this.cancelUpdate = this.cancelUpdate.bind(this);
    }
    updateProduct(product) {
        console.log('updateProduct: ' + product)
        product.name = this.refs.productName.value;
        product.quantity = this.refs.quantity.value;
        product.price = this.refs.price.value;
        this.props.renderAddProductForm();
    }
    cancelUpdate() {
        console.log('cancelUpdate')
        this.props.renderAddProductForm();
    }
    getSpaces(no) {
        var spaces = '';
        for(var i=0;i<no;i++) {
            spaces += '\u00A0';
        }
        return spaces;
    }
    render() {
        return <div>
            <h1><center>Edit Product</center></h1>
            <h3>
                        ID: {this.getSpaces(14)}<input type="text" ref="productId" value={this.props.product.id}/><br/><br/>
                        Name: {this.getSpaces(8)}<input type="text" ref="productName" defaultValue={this.props.product.name} /><br/><br/>
                        Quantity: {this.getSpaces(3)}<input type="text" ref="quantity" defaultValue={this.props.product.quantity}/><br/><br/>
                        Price: {this.getSpaces(9)}<input type="text" ref="price" defaultValue={this.props.product.price}/><br/><br/><br/>
                        {this.getSpaces(15)}<input type="button" name="updateProduct" defaultValue="UPDATE" onClick={this.updateProduct.bind(this, this.props.product)}/> {'\u00A0'}{'\u00A0'}{'\u00A0'} <input type="button" name="cancelProduct" value="CANCEL" onClick={this.cancelUpdate.bind(this)}/>
            </h3></div>
    }
}

export default EditProductForm
