.model small
.stack
.data
    nombre db "Name:$"
    programa db "Program:$"
    seccion db "Section:$"
    dot db      "...........................................................$"
    space db    "                                                     $"
.code

cbrf:
mov ax, @data
mov ds, ax

mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 79h             ;setvidmode
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

mov bh, 40h             ;make red box w/black text
mov ch, 6
mov cl, 10
mov dh, 18
mov dl, 68
int 10h
    
mov bh, 70h             ;make grey box w/black text
mov ch, 9
mov cl, 25
mov dh, 15
mov dl, 65
int 10h

mov bh, 17h             ;make blue box w/grey text
mov ch, 9
mov cl, 13
mov dh, 15
mov dl, 24
int 10h

mov ch, 18
dotmaker:               ;generate dots for all of box
    mov ah, 02h
    mov bh, 00h
    mov dh, ch
    mov dl, 10
    int 10h
    
    mov ah, 09h
    mov dx, offset dot
    int 21h

    cmp ch, 6
    je out1
    loop dotmaker
    
        
out1:
mov ch, 15
clearinside:            ;clear specific area, those inside the blue and grey box
    mov ah, 02h
    mov bh, 00h
    mov dh, ch
    mov dl, 13
    int 10h
    
    mov ah, 09h
    mov dx, offset space
    int 21h

    cmp ch, 9
    je out2
    loop clearinside
    
        
out2:

mov ah, 02h             ;cursorloc and prin for the Name, Program, and Section
mov bh, 00h
mov dh, 10
mov dl, 14
int 10h

mov ah, 09h
mov dx, offset nombre
int 21h

mov ah, 02h
mov bh, 00h
mov dh, 12
mov dl, 14
int 10h

mov ah, 09h
mov dx, offset programa
int 21h

mov ah, 02h
mov bh, 00h
mov dh, 14
mov dl, 14
int 10h

mov ah, 09h
mov dx, offset seccion
int 21h

mov ah, 02h             ;cursorloc for the text inputs
mov bh, 00h
mov dh, 10
mov dl, 27
int 10h

mov cx, 22
mov ah, 01h
    
nameloop:
    int 21h
    cmp al, 08h         ;i used backspace key as the __enter__ key for this
    je exit1
    loop nameloop
    
exit1:
mov ah, 02h             ;cursorloc for the text inputs
mov bh, 00h
mov dh, 12
mov dl, 27
int 10h

mov cx, 22
mov ah, 01h
    
progloop:
    int 21h
    cmp al, 08h
    je exit2
    loop progloop
    
exit2:
    
mov ah, 02h             ;cursorloc for the text inputs
mov bh, 00h
mov dh, 14
mov dl, 27
int 10h

mov cx, 22
mov ah, 01h
    
secloop:
    int 21h
    cmp al, 08h
    je exit3
    loop secloop
    
exit3:

    
mov ah, 02h             ;start of end
mov bh, 00h
mov dh, 18
mov dl, 10
int 10h

mov ah, 4ch ;ending
int 21h
end cbrf