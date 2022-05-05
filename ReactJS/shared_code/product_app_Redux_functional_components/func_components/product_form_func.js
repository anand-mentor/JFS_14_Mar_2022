import {React, useRef} from 'react';
import {useDispatch, useSelector} from 'react-redux';
import AddProduct from '../actions/add_product';

const ProductFormFunc = (props) => {
   

    const nameRef = useRef(null);
    const quantityRef = useRef(null);
    const priceRef = useRef(null);

    let dispatcher = useDispatch();
    let productList = useSelector((state)=>state.products);
    const addProduct = ()=>{
        let newProduct = { "id": productList.length + 1, "name": nameRef.current.value, "quantity": quantityRef.current.value,
            "price": priceRef.current.value};
        dispatcher(AddProduct(productList, newProduct));
    }

    return <h3>
    Name: {'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref={nameRef}/><br/><br/>
    Quantity: {'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref={quantityRef}/><br/><br/>
    Price: {'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="text" ref={priceRef}/><br/><br/><br/>
    {'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}{'\u00A0'}<input type="submit" name="addproduct" value="ADD PRODUCT" onClick={addProduct}/>
    </h3>

}

export default ProductFormFunc;
