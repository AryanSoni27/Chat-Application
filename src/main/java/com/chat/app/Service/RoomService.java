package com.chat.app.Service;

import com.chat.app.Entity.Room;
import com.chat.app.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    //Create New Room
    private ResponseEntity<?> createRoom(Room room){

        if(roomRepository.findByRoomId(room.getRoomId()) != null){
            return ResponseEntity.badRequest().body("Room already exists");
        }
        roomRepository.save(room);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //Get Room by RoomId
    private Room getRoomById(String id){
        return roomRepository.findByRoomId(id);
    }

    //Get messages of the room

}
