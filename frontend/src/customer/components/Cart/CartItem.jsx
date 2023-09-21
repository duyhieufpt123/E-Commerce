import { Button, IconButton } from "@mui/material";
import React from "react";
import RemoveCircleOutlineIcon from "@mui/icons-material/RemoveCircleOutline";
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
const CartItem = () => {
  return (
    <div className="p-5 shadow-lg border rounded-md">
      <div className="flex items-center">
        <div className="w-[5rem] h-[5rem] lg:w-[9rem] lg:h">
          <img
            className="w-full h-full object-cover object-top"
            src=""
            alt=""
          />
        </div>

        <div className="ml-5 space-y-1">
          <p className="font-semibold"></p>
          <p className="opacity-70"></p>
          <p className="opacity-70 mt-2"></p>

          <div className="flex space-x-5 items-center text-gray-900 mt-6 mt-5">
            <p className="font-semibold">6$</p>
            <p className="opacity-50 line-through">99$</p>
            <p className="text-green-600 font-semibold">20% Off</p>
          </div>
          <div className="lg:flex items-center lg:space-x-10 pt-4">
            <div className="flex items-center space-x-2">
              <IconButton >
                <RemoveCircleOutlineIcon />
              </IconButton>
              <span className="py-1 px-7 border rounded-sm">3</span>
                <IconButton sx={{color:"RGB(145 85 283)"}}>
                  <AddCircleOutlineIcon/>
                </IconButton>
            </div>
            <div>
              <Button sx={{color:"RGB(145 85 283)"}}>Remove</Button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default CartItem;
