import ProductFormFunc from './product_form_func';
import ProductTableFunc from './product_table_func';
import {useState} from 'react';
import EditProductFormFunc from './edit_product_func';
import { useSelector, useDispatch } from 'react-redux';

const ProductAppFunc = (props)=>{

    let products = useSelector((state)=> state.products);
    let renderForm = useSelector((state)=> state.renderForm);
    let selected_product = useSelector((state)=> state.selectedProduct);

    if (renderForm === 'ADD_PRODUCT')  {
        return <div>
        <h1><center>Product Application</center></h1>
        <ProductFormFunc/>
        <br></br>
        <ProductTableFunc/>  
        </div>
    }
    else if (renderForm === 'EDIT_PRODUCT')  {
        return <div>
            <EditProductFormFunc product={selected_product} />
        </div>
    }
}

export default ProductAppFunc;
