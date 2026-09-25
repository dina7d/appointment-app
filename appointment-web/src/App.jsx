import { useEffect, useState } from 'react';
import api from './services/api';
import './App.css';

function App() {
  const [clients, setClients] = useState([]);

  useEffect(() => {
    // This calls http://localhost:8080/api/clients
    api.get('/clients')
      .then((response) => {
        setClients(response.data);
      })
      .catch((error) => {
        console.error("Error fetching clients:", error);
      });
  }, []);

  return (
    <div>
      <h1>Appointment System</h1>
      <p>React Frontend Connected</p>
      
      <h2>Raw Client Data:</h2>
      {/* This will print the raw data exactly as Spring Boot sends it */}
      <pre style={{ textAlign: 'left', background: '#333', color: '#fff', padding: '10px' }}>
       <div style={{ display: 'flex', flexDirection: 'column', gap: '10px', maxWidth: '400px', margin: '0 auto' }}>
        {clients.map(client => (
          <div key={client.id} style={{ border: '1px solid #ccc', padding: '15px', borderRadius: '8px', textAlign: 'left' }}>
            <h3 style={{ margin: '0 0 10px 0' }}>{client.firstName} {client.lastName}</h3>
            <p style={{ margin: '5px 0' }}><strong>Téléphone :</strong> {client.phone}</p>
            <p style={{ margin: '5px 0' }}><strong>Statut :</strong> {client.syncStatus}</p>
          </div>
        ))}
      </div>
      </pre>
    </div>
  );
}

export default App;