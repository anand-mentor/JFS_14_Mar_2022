import React from 'react'

class AddProductForm extends React.Component {
    constructor(props) {
        super(props)
        this.addProduct = this.addProduct.bind(this);
    }

    addProduct() {
        var id = this.props.products.length + 1;
        this.props.updateProductList({id: id, name: this.refs.productName.value, quantity: this.refs.quantity.value, price: this.refs.price.value});
    }

    render() {
        return <h3>
					Name: {'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref="productName"/><br/><br/>
					Quantity: {'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref="quantity"/><br/><br/>
					Price: {'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref="price"/><br/><br/><br/>
					{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="submit" name="addproduct" value="ADD PRODUCT" onClick={this.addProduct.bind(this)}/>
				</h3>
    }
}

export default AddProductForm
