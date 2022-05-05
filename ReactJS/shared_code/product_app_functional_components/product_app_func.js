import ProductFormFunc from './product_form_func';
import ProductTableFunc from './product_table_func';
import {useState} from 'react';
import EditProductFormFunc from './edit_product_func';

const ProductAppFunc = (props)=>{

    const [products, setProducts] = useState([]);
    const [renderForm, setRenderForm] = useState('ADD_PRODUCT');
    const [selected_product, setSelectedProduct] = useState({});

    const addProduct = (product)=> {
        product.id = products.length + 1;
        products.push(product);
        let copyOfProducts = [...products];
        setProducts(copyOfProducts);
        setRenderForm('ADD_PRODUCT');
    }
    const renderAddProductForm = (product) => {
        setRenderForm('ADD_PRODUCT');
    }

    const renderEditProductForm = (product) => {
        setRenderForm('EDIT_PRODUCT');
        setSelectedProduct(product);
    }

    const removeProductFromList = (index) => {
        products.splice(index, 1);
        let productListCopy = [...products];
        setProducts(productListCopy);
    }

    if (renderForm === 'ADD_PRODUCT')  {
        return <div>
        <h1><center>Product Application</center></h1>
        <ProductFormFunc addProduct={addProduct} />
        <br></br>
        <ProductTableFunc products={products} removeProductFromList={removeProductFromList} 
            renderEditProductForm={renderEditProductForm}></ProductTableFunc>
        </div>
    }
    else if (renderForm === 'EDIT_PRODUCT')  {
        return <div>
            <EditProductFormFunc product={selected_product} renderAddProductForm={renderAddProductForm}/>
        </div>
    }
}

export default ProductAppFunc;
