import { useDispatch, useSelector } from "react-redux";
import EditProductAction from '../actions/edit_product';
import DeleteProductAction from '../actions/delete_product';

const ProductTableFunc = (props) => { 

    let dispatcher = useDispatch();
    let products = useSelector((state)=>state.products);

    const editProduct = (product) => {
        dispatcher(EditProductAction(product))
    }
    const deleteProduct = (productId) => {
        dispatcher(DeleteProductAction(products, productId));
    }
    let productData =  products.map(function(product, index) {
        return (<tr key={index}><td>{product.id}</td><td>{product.name}</td><td>{product.quantity}</td><td>{product.price}</td><td><input type='button' onClick={editProduct.bind(this, product)} value='EDIT'/><input type='button' onClick={deleteProduct.bind(this, product.id)} value='DELETE'/></td></tr>);
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

export default ProductTableFunc;
