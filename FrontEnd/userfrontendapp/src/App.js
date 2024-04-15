import './App.css';
import UserInfo from './components/UserInfo';
import UserNav from './components/UserNav';
// go to this directiory 
import 'bootstrap/dist/css/bootstrap.min.css';


function App() {
  return (
    <div className="App">
     <UserNav/>
     <UserInfo/>
    </div>
  );
}

export default App;
