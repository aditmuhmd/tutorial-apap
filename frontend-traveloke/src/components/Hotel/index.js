import React from "react";
import classes from "./styles.module.css";
import Button from "../../components/Button";

const Hotel = (props) => {
    const { id, namaHotel, alamat, nomorTelepon, handleDelete, handleEdit, listKamar } = props;
    const kamarHotel = listKamar.map((kamar) => 
        <span key={kamar.noKamar} class="btn btn-secondary mr-2 disabled rounded-pill" >
        {kamar.namaKamar} <span class="badge badge-light">{kamar.kapasitasKamar}</span>
        </span>
    );
    return (
        <div className={`shadow ${classes.hotel}`}>
            <h3>{`ID Hotel ${id}`}</h3>
            <p>{`Nama Hotel: ${namaHotel}`}</p>
            <p>{`Alamat: ${alamat}`}</p>
            <p>{`Nomor telepon: ${nomorTelepon}`}</p>
            <p>{`List Kamar: `}</p>
            <p> {kamarHotel.length !== 0 ? kamarHotel : <strong>Hotel tidak memiliki kamar</strong>} </p>
            <Button onClick={handleEdit} variant="success">
                Edit
            </Button>
            <Button onClick={handleDelete} variant="danger">
                Delete
            </Button>
        </div>
    );
};
export default Hotel;