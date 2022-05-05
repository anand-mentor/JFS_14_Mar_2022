const ProductTableFunc = (props) => { 

    let productData =  props.products.map(function(product, index) {
        return (<tr key={index}><td>{product.id}</td><td>{product.name}</td><td>{product.quantity}</td><td>{product.price}</td><td><input type='button' onClick={props.renderEditProductForm.bind(this, product)} value='EDIT'/><input type='button' onClick={props.removeProductFromList.bind(this, index)} value='DELETE'/></td></tr>);
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
