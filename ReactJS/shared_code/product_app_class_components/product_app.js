import React from 'react'
import ProductTable from './product_table';
import AddProductForm from './product_form';
import EditProductForm from './edit_product';

class ProductApp extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            products : [{id: 1, name: 'Chair', quantity: 20, price: 800},
						{id: 2, name: 'Bag', quantity: 110, price: 2400},
						{id: 3, name: 'Laptop', quantity: 40000, price: 12}
                       ],
            renderForm: 'ADD_PRODUCT'
        }
        this.updateProductList = this.updateProductList.bind(this);
        this.renderEditProductForm = this.renderEditProductForm.bind(this);
        this.renderAddProductForm = this.renderAddProductForm.bind(this);
        this.removeProductFromList = this.removeProductFromList.bind(this);
    }

    renderEditProductForm(product) {
        this.setState({ renderForm: 'EDIT_PRODUCT', selected_product: product});
    }

    renderAddProductForm(product) {
        this.setState({ renderForm: 'ADD_PRODUCT'});
    }

    updateProductList(product) {
        this.state.products.push(product)
        this.setState({products: this.state.products});
        this.state.products.map(function(product, index) {
                return (<tr key={index}><td>{product.id}</td><td>{product.name}</td><td>{product.quantity}</td><td>{product.price}</td><td>Edit Delete</td></tr>);
            })
    }

    removeProductFromList(index) {
        this.state.products.splice(index, 1);
        this.setState({products: this.state.products});
    }

    render() {
        var render_form = this.state.renderForm;
        if (render_form === 'ADD_PRODUCT')  {
            return <div>
            <h1><center>Product Application</center></h1>
            <AddProductForm products={this.state.products} updateProductList={this.updateProductList}/>
            <br></br><br></br>
            <ProductTable products={this.state.products} renderEditProductForm={this.renderEditProductForm} removeProductFromList={this.removeProductFromList}/>
            </div>
        }
        else if (render_form === 'EDIT_PRODUCT')  {
            return <div>
            <EditProductForm product={this.state.selected_product} renderAddProductForm={this.renderAddProductForm}/>
            </div>
        }
        else {
            return null;
        }
    }
}

export default ProductApp