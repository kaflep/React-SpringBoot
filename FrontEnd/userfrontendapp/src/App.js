import './App.css';
import UserInfo from './components/UserInfo';
import UserNav from './components/UserNav';
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
