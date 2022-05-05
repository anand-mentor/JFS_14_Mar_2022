import {useRef} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import CancelEditAction from '../actions/cancel_edit';
import UpdateProductAction from '../actions/update_product';

const EditProductFormFunc = (props) => {
    const idRef = useRef(null);
    const nameRef = useRef(null);
    const quantityRef = useRef(null);
    const priceRef = useRef(null);

    let dispatcher = useDispatch();
    let products = useSelector((state)=>state.products);

    const getSpaces = (no)=> {
        var spaces = '';
        for(var i=0;i<no;i++) {
            spaces += '\u00A0';
        }
        return spaces;
    }
    const updateProduct = (product) => {
        product.name = nameRef.current.value;
        product.quantity = quantityRef.current.value;
        product.price = priceRef.current.value;
        dispatcher(UpdateProductAction(products, product));
    }
    const cancelEdit = () => {
        dispatcher(CancelEditAction());
    }
    return <div>
    <h1><center>Edit Product</center></h1>
    <h3>
                ID: {getSpaces(14)}<input type="text" ref={idRef} defaultValue={props.product.id}/><br/><br/>
                Name: {getSpaces(8)}<input type="text" ref={nameRef} defaultValue={props.product.name} /><br/><br/>
                Quantity: {getSpaces(3)}<input type="text" ref={quantityRef} defaultValue={props.product.quantity}/><br/><br/>
                Price: {getSpaces(9)}<input type="text" ref={priceRef} defaultValue={props.product.price}/><br/><br/><br/>
                {getSpaces(15)}<input type="button" name="updateProduct" defaultValue="UPDATE" onClick={updateProduct.bind(this, props.product)}/> {'\u00A0'}{'\u00A0'}{'\u00A0'} <input type="button" name="cancelProduct" value="CANCEL" onClick={cancelEdit}/>
    </h3></div>
}

export default EditProductFormFunc;
