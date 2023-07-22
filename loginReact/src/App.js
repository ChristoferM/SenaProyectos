import React, {useState} from 'react';
import { Link, Route, Routes ,BrowserRouter, Router } from "react-router-dom";

import Registro from './component/Registro';
import Login from './component/Login';
import DetalleProducto from './component/DetalleProducto';
import AdminView from './component/AdminView';

import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
function App() {




  return (
    <>
    <BrowserRouter>
     <Navbar bg="light" expand="lg">
      <Container>
        <Navbar.Brand href="#home">Students App</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#link">
              <Link to="/" >Login </Link></Nav.Link>
            <Nav.Link href="#link">
             <Link to="/registrarse" >Registrarse </Link>
            </Nav.Link>
            <Nav.Link href="#link">
            <Link to="/adminView" >admin View </Link>
           </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    <div>
      <Routes>
        <Route path="/registrarse" element={<Registro />} />
        <Route path="/" element={<Login />} />
        <Route path="/adminView" element={<AdminView/>} />
      </Routes>

    </div>  
    </BrowserRouter>
    </>
    
  );
}

export default App;
