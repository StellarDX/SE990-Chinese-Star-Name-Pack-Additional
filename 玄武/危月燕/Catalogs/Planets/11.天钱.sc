// Object * eta PsA  ---  Be Star  ---  OID=@1218105   (@@25130,0)  ---  coobox=8393 
// Object types: Be Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "ETA PsA A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "ETA PsA"
	Class           "B6III_sh"
	AbsMagn         -1.53
	MassSol         4.01
	Radius          4539907.58686353 // 计算的值
	LumBol          881
	Teff            12310
	Age             0.115

	BinaryOrbit     
	{
		Epoch           2451545
		Separation      455.63887210412 // 1.818 asec
		PositionAngle   113.4
	}
}

Star "ETA PsA B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "ETA PsA"
	Class           "B8.5V"
	MassSol         3.6
	Radius          1797271.27738379 // log(g) = 4.17 cm/s^2
	LumBol          240.63895327757 // 计算的值
	Teff            14144
	FeH             -0.21
}

// Object * 11 PsA  ---  Star  ---  OID=@1218087   (@@25123,24)  ---  coobox=8393 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "11 PsA A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "11 PsA"
	Class           "F2V"
	AbsMagn         3.28 // 计算的值
	MassKg          2.49691321466565e+30 // log(g) = 4.141 cm/s^2
	RadSol          1.577548 // Gaia DR3
	LumBol          5.15927636146264 // 计算的值
	Teff            6926
	FeH             -0.634

	BinaryOrbit     
	{
		Separation      796.288641401374 // 11.38 asec
	}
}

// Object * 11 PsA B  ---  Star  ---  OID=@1218088   (@@25123,25)  ---  coobox=8393 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "11 PsA B/Gaia DR3 6619460874280273536/TIC 270101562/ADS 15509 B/CCDM J21596-2738B/CD-28 17533B/CSI-28 17533 22/WDS J21596-2738B/** STN 56B/TYC 6960-1867-1/UCAC4 312-257063/2MASS J21593524-2737405/Gaia DR2 6619460874280273536"
{
	DateUpdated     "2024-06-15"
	ParentBody      "11 PsA"
	Parallax        14.2795
	AppMagn         10.39
	Class           ""
	AbsMagn         6.16 // 计算的值
	MassKg          1.48351602016997e+30 // log(g) = 4.568 cm/s^2
	RadSol          0.74375 // Gaia DR3
	LumBol          0.271903511485336 // 计算的值
	Teff            4833
	FeH             0.077
}
