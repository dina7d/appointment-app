function ClientCard({ client }) {
  return (
    <div style={{ border: '1px solid #ccc', padding: '15px', borderRadius: '8px', textAlign: 'left' }}>
      <h3 style={{ margin: '0 0 10px 0' }}>{client.firstName} {client.lastName}</h3>
      <p style={{ margin: '5px 0' }}><strong>Téléphone :</strong> {client.phone}</p>
      <p style={{ margin: '5px 0' }}><strong>Statut :</strong> {client.syncStatus}</p>
    </div>
  );
}

export default ClientCard;