import { component } from "react";

class ErrorProcess extends component{

   state = {
     isError: false,
     message:'', 
   };

    componentDidCatch(error, info){
        console.error(error,info);

        this.setstate({isError: true, message: error.message});
        }
   render() {
      const { isError, message } = this.state;
      const{children} = this.props;

      return isError ? <div>{message}</div> : children;


        }
}
export default ErrorProcess;
