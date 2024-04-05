import axios from 'axios';
import { useState } from "react";
function UserInfo() {
  const[id,setId] = useState('');
  const[name,setName] = useState('');
  const[address,setAddress] = useState('');
  async function save(event){
    event.preventDefault();
    try {
      await axios.post("http://localhost:8080/user/add",
      {
       
        name: name,
        address:address
      });
      alert("User Info successfully");
      setId("");
      setName("");
      setAddress("");
    }
    catch(err)
    {
      alert("User info failed");
    }

  }
  return (
    <div className="container mt-4">
<form>
  <div className="form-group">
    <label>Name</label>
    <input type="text" className="form-control" placeholder="Enter Name"
      value={name}
      onChange={(event) => {
        setName(event.target.value);
      }} 
   />
    
  </div>
  <div class="form-group">
    <label>Address</label>
    <input type="text" className="form-control" placeholder="Enter Address"
          value={address}
          onChange={(event) => {
            setAddress(event.target.value);
          }}
    /> 
  </div>
  <button className="btn btn-primary mt-4" onClick={save}>Submit</button>
</form>
    </div>
  );
}
export default UserInfo;


