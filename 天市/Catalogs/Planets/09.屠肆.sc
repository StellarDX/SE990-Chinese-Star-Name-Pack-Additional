// Object * 105 Her  ---  Spectroscopic Binary  ---  OID=@2784015   (@@55782,0)  ---  coobox=19723 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Remove "105 Her A" {ParentBody "105 Her"}
Remove "105 Her B" {ParentBody "105 Her"}
Star "105 Her A"
{
	DateUpdated     "2024-05-17"
	ParentBody      "HIP 89773"
	Class           "K3III:Ba0.5"
	AbsMagn         -2.59 // 计算的值

	BinaryOrbit // 未修改
	{
		Period          2.9892
		Separation      0.8656
		Eccentricity    0.246
		Inclination     105.6
		AscendingNode   20.6
		ArgOfPericenter 223.1
		Epoch           2451788
		MeanAnomaly     0
	}
}

Star "105 Her B"
{
	ParentBody      "HIP 89773"
	Class           "WD?"
}