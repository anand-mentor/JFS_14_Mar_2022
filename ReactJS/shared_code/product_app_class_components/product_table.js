import React from 'react'
import EditProductForm from './edit_product';

class ProductTable extends React.Component {
    constructor(props) {
        super(props)
        this.editProduct = this.editProduct.bind(this);
        this.deleteProduct = this.deleteProduct.bind(this);
    }
    editProduct(product) {
        this.props.renderEditProductForm(product);
    }
    deleteProduct(index) {
        console.log('index = ' + index);
        //this.props.products.splice(index);
        //console.log('new products: ' + this.props.products);
        this.props.removeProductFromList(index);
    }
    render() {
        var editProduct = this.editProduct;
        var deleteProduct = this.deleteProduct;
        var productData =  this.props.products.map(function(product, index) {
                return (<tr key={index}><td>{product.id}</td><td>{product.name}</td><td>{product.quantity}</td><td>{product.price}</td><td><input type='button' onClick={editProduct.bind(this, product)} value='EDIT'/><input type='button' onClick={deleteProduct.bind(this, index)} value='DELETE'/></td></tr>);
            })          
            
            return <div><center><table>
					<thead>
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>QUANTITY</th>
						<th>PRICE</th>
						<th>ACTIONS</th>
					</tr>
					</thead>
					<tbody>
					{productData}
					</tbody>
					</table>
                    </center>
                    </div>
    }
}

export default ProductTable
