const AddProduct = (productList, new_product) => {
    productList.push(new_product);
    return {
        type: 'ADD_PRODUCT',
        payload: [...productList]
    }
}

export default AddProduct;